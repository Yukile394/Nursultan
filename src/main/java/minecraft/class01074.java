package minecraft;

import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

class class01074 implements class00580, Consumer<class00405> {
   private class00577 u;
   private final class01065 i;
   @Nullable
   private final Consumer<class00405> R;

   class01074(class00577 var1, class01065 var2, @Nullable Consumer<class00405> var3, Consumer var4) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
   }

   public void accept(class00405 var1) {
      if (this.i.field_63853 && var1.z() != null) {
         this.L.R = var1;
      }

      if (this.i.field_63854 && var1.Z() != null) {
         this.L.M = var1;
      }

      if (this.R != null) {
         this.R.accept(var1);
      }
   }

   @Override
   public void N(class00392 var1, int var2, int var3, int var4, int var5, int var6, class00577 var7) {
      int ix = ((class01590)this.L.N.i_3).N(var1);
      byte b0 = 9;
      this.N(var1, var2, var3, var4, var5, var6, ix, b0, var7);
   }

   @Override
   public void N(class00937 var1, int var2, int var3, class00577 var4, class01028 var5) {
      boolean flag = this.i.field_63854 || this.i.field_63853 || this.R != null;
      int ix = var1.N(var2, (class01590)this.L.N.i_3, var5);
      class08652 class08652 = new class08652((class01590)this.L.N.i_3, var5, var4.N(), ix, var3, class02566.y(var4.y()), 0, true, flag, var4.L());
      if (class02566.u(var4.y()) != 0) {
         this.L.L.N(class08652);
      }

      if (flag) {
         class00580.N(class08652, (float)this.L.u, (float)this.L.i, this);
      }
   }

   @Override
   public class00577 N() {
      return this.u;
   }

   @Override
   public void N(class00577 var1) {
      this.u = var1;
   }
}
