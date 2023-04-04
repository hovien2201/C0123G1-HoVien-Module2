package case_study.repository;

import case_study.model.Booking;
import case_study.repository.interface_repository.IBookingRepository;
import case_study.util.read_wirte.ReadAndWrite;

import java.util.List;
import java.util.TreeSet;

public class BookingRepository implements IBookingRepository {
    private final String PATH= "case_study\\util\\file\\booking.csv";
    static TreeSet<Booking> bookingTreeSet=new TreeSet<>();

    @Override
    public void add(Booking booking) {
        String str=booking.getInfoToCSV();
        bookingTreeSet.add(booking);
        ReadAndWrite.writeFile(PATH,str,true);
    }

    @Override
    public TreeSet<Booking> read() {
        TreeSet<Booking> treeSet=new TreeSet<>();
        List<String> stringList=ReadAndWrite.readFile(PATH);
        for (int i = 0; i < stringList.size(); i++) {
            String [] arr=stringList.get(i).split(",");
            treeSet.add(new Booking(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6]));
        }
        bookingTreeSet=treeSet;
        return bookingTreeSet;
    }

}
