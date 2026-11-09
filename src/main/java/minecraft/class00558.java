package minecraft;

import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.IOException;
import java.util.function.BooleanSupplier;
import org.jspecify.annotations.Nullable;

public abstract class class00558 implements class00538, AutoCloseable {
   public boolean L(int var1, int var2) {
      return this.N(var1, var2, class00549.m, false) != null;
   }

   public abstract class05795 L();

   public class00558() {
      super();
   }

   @Override
   public void close() throws IOException {
   }

   public LongSet u() {
      return LongSet.of();
   }

   @Nullable
   @Override
   public class03482 y(int var1, int var2) {
      return this.N(var1, var2, class00549.L, false);
   }

   public abstract int y();

   public void N(boolean var1) {
   }

   @Nullable
   public class00570 N(int var1, int var2, boolean var3) {
      return (class00570)this.N(var1, var2, class00549.m, var3);
   }

   public boolean N(class07321 var1, boolean var2) {
      return false;
   }

   public void N(int var1, int var2, int var3, boolean var4) {
   }

   @Nullable
   public abstract class08050 N(int var1, int var2, class00549 var3, boolean var4);

   public abstract void N(BooleanSupplier var1, boolean var2);

   public abstract String N();

   @Nullable
   public class00570 N(int var1, int var2) {
      return this.N(var1, var2, false);
   }
}
