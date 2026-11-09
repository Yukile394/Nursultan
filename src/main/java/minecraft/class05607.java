package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import org.slf4j.Logger;

public class class05607 extends class01062 {
   private static final Logger M = LogUtils.getLogger();

   private void w() {
      try {
         this.M().M();
      } catch (IOException ioexception) {
         M.warn("Failed to load user banlist: ", ioexception);
      }
   }

   private void Q() {
      try {
         this.z().M();
      } catch (Exception exception) {
         M.warn("Failed to load white-list: ", exception);
      }
   }

   public class05607(class05623 var1, class02003<class02969> var2, class07842 var3) {
      super(var1, var2, var3, var1.Nt());
      this.N(var1.V());
      this.y(var1.e());
      this.w();
      this.l();
      this.d();
      this.G();
      this.k();
      this.Q();
      this.Y();
      if (!this.z().L().exists()) {
         this.O();
      }
   }

   private void l() {
      try {
         this.M().R();
      } catch (IOException ioexception) {
         M.warn("Failed to save user banlist: ", ioexception);
      }
   }

   private void d() {
      try {
         this.B().M();
      } catch (IOException ioexception) {
         M.warn("Failed to load ip banlist: ", ioexception);
      }
   }

   private void k() {
      try {
         this.E().M();
      } catch (Exception exception) {
         M.warn("Failed to load operators list: ", exception);
      }
   }

   @Override
   public boolean y(class08774 var1) {
      return this.E().y(var1);
   }

   @Override
   public boolean N(class08774 var1) {
      return !this.s() || this.R(var1) || this.z().N(var1);
   }

   private void O() {
      try {
         this.z().R();
      } catch (Exception exception) {
         M.warn("Failed to save white-list: ", exception);
      }
   }

   private void G() {
      try {
         this.B().R();
      } catch (IOException ioexception) {
         M.warn("Failed to save ip banlist: ", ioexception);
      }
   }

   @Override
   public void x_() {
      this.Q();
   }

   private void Y() {
      try {
         this.E().R();
      } catch (Exception exception) {
         M.warn("Failed to save operators list: ", exception);
      }
   }
}
