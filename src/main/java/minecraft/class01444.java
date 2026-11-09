package minecraft;

import java.io.DataInput;
import java.io.IOException;

public interface class01444<T extends class07709> extends class01424<T> {
   int L();

   @Override
   default void y(DataInput var1, class07726 var2) throws IOException {
      var1.skipBytes(this.L());
   }

   @Override
   default void N(DataInput var1, int var2, class07726 var3) throws IOException {
      var1.skipBytes(this.L() * var2);
   }
}
