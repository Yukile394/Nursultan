package minecraft;

import com.mojang.serialization.DynamicOps;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import java.nio.ByteBuffer;
import java.util.List;
import org.jspecify.annotations.Nullable;

final class class00151 extends class08886 {
   private static final ByteBuffer field_58008 = ByteBuffer.wrap(new byte[0]);

   class00151(String var1, int var2, class00157 var3, class00157... var4) {
      super(var3, var4);
   }

   @Override
   public <T> T N(DynamicOps<T> var1) {
      return (T)var1.createByteList(field_58008);
   }

   @Nullable
   @Override
   public <T> T N(DynamicOps<T> var1, List<class00170> var2, class02325<?> var3) {
      ByteArrayList bytearraylist = new ByteArrayList();

      for (class00170 class00170 : var2) {
         Number number = this.N(class00170, var3);
         if (number == null) {
            return null;
         }

         bytearraylist.add(number.byteValue());
      }

      return (T)var1.createByteList(ByteBuffer.wrap(bytearraylist.toByteArray()));
   }
}
