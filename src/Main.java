import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.Iterator;
import java.util.Optional;
import java.util.Properties;
import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        //Files.strea

        //Path path = Paths.get("D:\\temp\\test.txt");
        //Path tempDirectory = Files.createTempFile(null, ".txt");
        Path path = Paths.get("D:\\");
        Stream<Path> shugan = Files.find(path, 3, (p, b) -> p.startsWith("shugan"));
        //shugan.forEach(System.out::println);
        /*for (Path entry : paths) {
            System.out.println(entry);
        }*/
        //Iterator<Path> iterator = paths.iterator();

        /*try (Stream<Path> walk = Files.walk(path,2)) {
            walk.forEach(System.out::println);
        } catch (Exception e) {

        }*/
        //Stream<Path> list = Files.list(path);
        //list.forEach(s -> System.out.println(s.getFileName()));
        /*UserPrincipal owner = Files.getOwner(path);
        System.out.println(owner);
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        System.out.println(fileAttributeView.name());
        System.out.println(fileAttributeView.readAttributes().size());*/
        //System.out.println(path.toAbsolutePath());
        //System.out.println(path.getName(0));
        /*FileSystem fileSystem = path.getFileSystem();
        Iterable<Path> rootDirectories = fileSystem.getRootDirectories();
        Iterator<Path> iterator = rootDirectories.iterator();
        while (iterator.hasNext()) {
            Path next = iterator.next();
            Iterator<Path> iterator1 = next.iterator();
            while (iterator1.hasNext()) {
                System.out.println(iterator1.next());
            }
            //System.out.println(next);
        }*/
        /*Path path = Paths.get("D:\\test");
        Path temp1 = Paths.get("D:\\test\\okkkk\\aaa");
        Path relativize = temp1.relativize(path);
        System.out.println(temp1.toAbsolutePath());*/
        /*Path test = Paths.get("D:\\", "test", "ok.txt");
        Path resolve = test.resolve("D:\\ll.dat");
        System.out.println(resolve);*/
        /*System.out.println(resolve);
        System.out.println(test.getRoot());
        System.out.println(test.getParent());
        System.out.println(test.getFileName());
        System.out.println(test.getNameCount());
        System.out.println(test.getName(1));*/

        //System.out.println(temp1);
        /*Path resolve = path.resolve("ooo");
        Path temp = resolve.resolveSibling("temp");*/

        /*System.out.println(temp);
        Properties properties = System.getProperties();
        String property = properties.getProperty("base.dir");
        System.out.println(property);*/
        //Path path1 = Paths.get(property);
        /*FileSystem fileSystem = path.getFileSystem();
        System.out.println(fileSystem.isOpen());
        Iterable<Path> rootDirectories = fileSystem.getRootDirectories();
        Iterator<Path> iterator = rootDirectories.iterator();
        while (iterator.hasNext()) {
            Path fileName = iterator.next().getFileName();
            System.out.println(fileName.toString());
        }*/
    }
}
