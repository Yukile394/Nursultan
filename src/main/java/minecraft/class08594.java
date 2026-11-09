package minecraft;

import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class08594 extends class00394 {
   private static final Logger N = LogUtils.getLogger();
   private static final String y = "";
   private static final boolean L = false;
   private class00235 u;
   private String i = "";
   private boolean R = false;
   private boolean M;

   public class00235 L() {
      return this.u;
   }

   public void M() {
      if (!this.i.isBlank()) {
         N.info("Test {} (at {}): {}", new Object[]{this.u.method_15434(), this.d(), this.i});
      }
   }

   public class08594(class07209 var1, class00500 var2) {
      super(class00404.field_55992, var1, var2);
      this.u = var2.L(class08620.y);
   }

   public boolean B() {
      return this.M;
   }

   public String Z() {
      return this.i;
   }

   private class00891 U() {
      return this.w().i();
   }

   private void z() {
      if (this.z != null) {
         class07209 class07209 = this.d();
         class00500 class00500 = this.z.method_8320(class07209);
         if (class00500.N(class00869.TN)) {
            this.z.method_8652(class07209, class00500.y(class08620.y, this.u), 2);
         }
      }
   }

   public void u() {
      this.M = false;
      if (this.u == class00235.field_56024 && this.z != null) {
         this.N(false);
         this.z.method_8408(this.d(), this.U());
      }
   }

   public boolean y() {
      return this.R;
   }

   @Override
   protected void N(class08329 var1) {
      var1.N("mode", class00235.field_56028, this.u);
      var1.N("message", this.i);
      var1.N("powered", this.R);
   }

   public void N(String var1) {
      this.i = var1;
   }

   public void N(class00235 var1) {
      this.u = var1;
      this.z();
   }

   public void N(boolean var1) {
      this.R = var1;
   }

   @Override
   public class07001 N(class01929 var1) {
      return this.u(var1);
   }

   @Nullable
   public class07269 i() {
      return class07269.N(this);
   }

   @Override
   protected void N(class08299 var1) {
      this.u = var1.<class00235>N("mode", class00235.field_56028).orElse(class00235.field_56026);
      this.i = var1.N("message", "");
      this.R = var1.N("powered", false);
   }

   public void R() {
      if (this.u == class00235.field_56024 && this.z != null) {
         this.N(true);
         class07209 class07209 = this.d();
         this.z.method_8408(class07209, this.U());
         this.z.method_8397().y(class07209, this.U());
         this.M();
      } else {
         if (this.u == class00235.field_56025) {
            this.M();
         }

         this.M = true;
      }
   }
}
