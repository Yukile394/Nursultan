package minecraft;

import Nursultan.class09362;

public class class00402 extends class00394 {
   private static final boolean N = false;
   private static final boolean y = false;
   private static final boolean L = false;
   private boolean u = false;
   private boolean i = false;
   private boolean R = false;
   private final class07327 M = new class09362(this);

   public boolean L() {
      return this.u;
   }

   public boolean M() {
      return this.R;
   }

   public class00402(class07209 var1, class00500 var2) {
      super(class00404.field_11904, var1, var2);
   }

   public boolean B() {
      this.R = true;
      if (this.z()) {
         class07209 class07209 = this.U.method_10093(this.z.method_8320(this.U).L(class06759.y).b());
         if (this.z.method_8320(class07209).i() instanceof class06759) {
            class00394 class00394 = this.z.method_8321(class07209);
            this.R = class00394 instanceof class00402 && ((class00402)class00394).N().y() > 0;
         } else {
            this.R = false;
         }
      }

      return this.R;
   }

   public class00384 Z() {
      class00500 class00500 = this.w();
      if (class00500.N(class00869.MQ)) {
         return class00384.field_11924;
      } else if (class00500.N(class00869.EQ)) {
         return class00384.field_11923;
      } else {
         return class00500.N(class00869.EO) ? class00384.field_11922 : class00384.field_11924;
      }
   }

   private void U() {
      class00891 class00891 = this.w().i();
      if (class00891 instanceof class06759) {
         this.B();
         this.z.N(this.U, class00891, 1);
      }
   }

   public boolean z() {
      class00500 class00500 = this.z.method_8320(this.d());
      return class00500.i() instanceof class06759 ? class00500.L(class06759.L) : false;
   }

   public boolean u() {
      return this.i;
   }

   @Override
   public void y(class08329 var1) {
      super.y(var1);
      var1.L("CustomName");
      var1.L("conditionMet");
      var1.L("powered");
   }

   public void y(boolean var1) {
      boolean flag = this.i;
      this.i = var1;
      if (!flag && var1 && !this.u && this.z != null && this.Z() != class00384.field_11922) {
         this.U();
      }
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      this.M.N(var1);
      var1.N("powered", this.L());
      var1.N("conditionMet", this.M());
      var1.N("auto", this.u());
   }

   @Override
   protected void N_9(class02666 var1) {
      super.N_9(var1);
      this.M.N(var1.method_58694(class02484.B));
   }

   @Override
   protected void N(class02676 var1) {
      super.N(var1);
      var1.N(class02484.B, this.M.R());
   }

   public void N(boolean var1) {
      this.u = var1;
   }

   public class07327 N() {
      return this.M;
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      this.M.N(var1);
      this.u = var1.N("powered", false);
      this.R = var1.N("conditionMet", false);
      this.y(var1.N("auto", false));
   }

   public void R() {
      if (this.Z() == class00384.field_11923 && (this.u || this.i) && this.z != null) {
         this.U();
      }
   }
}
