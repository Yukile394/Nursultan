package minecraft;

import com.google.common.collect.Lists;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.io.IOUtils;

public class class05109 {
   public class05109() {
      super();
   }

   private static long y() {
      return class07536.L();
   }

   public static List<class04970> N() {
      return N(class05093.values());
   }

   private static int N(String var0) {
      short short1 = 700;
      long i = 0L;
      Socket socket = null;

      for (int j = 0; j < 5; j++) {
         try {
            InetSocketAddress inetsocketaddress = new InetSocketAddress(var0, 80);
            socket = new Socket();
            long k = y();
            socket.connect(inetsocketaddress, 700);
            i += y() - k;
         } catch (Exception exception) {
            i += 700L;
         } finally {
            IOUtils.closeQuietly(socket);
         }
      }

      return (int)(i / 5.0);
   }

   public static List<class04970> N(class05093... var0) {
      for (class05093 class05093x : var0) {
         N(class05093x.field_19574);
      }

      ArrayList arraylist = Lists.newArrayList();

      for (class05093 class05093 : var0) {
         arraylist.add(new class04970(class05093.field_19573, N(class05093.field_19574)));
      }

      arraylist.sort(Comparator.comparingInt(class04970::y));
      return arraylist;
   }
}
