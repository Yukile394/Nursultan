package minecraft;

import java.nio.file.Path;
import java.util.List;

public interface class04681 {
   char y = '\u001e';

   long L();

   default long M() {
      return this.L() - this.N();
   }

   String i();

   int u();

   static String y(String var0) {
      return var0.replace('\u001e', '.');
   }

   int y();

   boolean N(Path var1);

   List<class05005> N(String var1);

   long N();

   default int R() {
      return this.u() - this.y();
   }
}
