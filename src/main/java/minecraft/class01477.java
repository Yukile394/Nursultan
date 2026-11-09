package minecraft;

import java.io.DataInput;
import java.io.IOException;

public interface class01477<T extends class07709> extends class01424<T> {
   @Override
   default void N(DataInput var1, int var2, class07726 var3) throws IOException {
      for (int i = 0; i < var2; i++) {
         this.y(var1, var3);
      }
   }
}
