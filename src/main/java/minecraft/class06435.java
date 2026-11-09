package minecraft;

import java.nio.file.Path;

public class class06435 extends class06434 {
   private static final class00392 y = class00392.L("recover_world.warning").N(var0 -> var0.N(-65536));
   private static final class00392 L = class00392.L("recover_world.button");
   private final long u;

   @Override
   public boolean T() {
      return false;
   }

   public class06435(String var1, Path var2, long var3) {
      super(null, null, var1, false, false, false, var2);
      this.u = var3;
   }

   @Override
   public boolean n() {
      return true;
   }

   @Override
   public boolean l() {
      return false;
   }

   @Override
   public boolean t() {
      return false;
   }

   @Override
   public class00392 v() {
      return L;
   }

   @Override
   public class00392 j() {
      return y;
   }

   @Override
   public String y() {
      return this.N();
   }

   @Override
   public long R() {
      return this.u;
   }

   @Override
   public boolean G() {
      return false;
   }
}
