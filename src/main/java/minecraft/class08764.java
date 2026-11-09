package minecraft;

import org.jspecify.annotations.Nullable;

public class class08764 {
   private final class06202 N;
   @Nullable
   private class08762 y;

   public void L() {
      if (this.y != null) {
         this.y();
      }

      this.y = ((class05630)this.N.i_7).T.N(this);
   }

   public class08764(class06202 var1, class05630 var2) {
      super();
      this.N = var1;
   }

   public class06202 i() {
      return this.N;
   }

   public void u() {
      if (this.y != null) {
         if ((class03448)this.N.T_3 != null) {
            this.y.N();
         } else {
            this.y();
         }
      } else if ((class03448)this.N.T_3 != null) {
         this.L();
      }
   }

   public void y() {
      if (this.y != null) {
         this.y.y();
         this.y = null;
      }
   }

   public void N(double var1, double var3) {
      if (this.y != null) {
         this.y.N(var1, var3);
      }
   }

   public void N(class08966 var1) {
      ((class05630)this.N.i_7).T = var1;
      ((class05630)this.N.i_7).Np();
      if (this.y != null) {
         this.y.y();
         this.y = var1.N(this);
      }
   }

   public void N(class04474 var1) {
      if (this.y != null) {
         this.y.N(var1);
      }
   }

   public static class00392 N(String var0) {
      return class00392.u("key." + var0).N(class06541.field_1067);
   }

   public void N(class06584 var1, class06584 var2, class05442 var3) {
   }

   public void N(class06584 var1) {
      if (this.y != null) {
         this.y.N(var1);
      }
   }

   public void N() {
      if (this.y != null) {
         this.y.L();
      }
   }

   public void N(class03448 var1, class07209 var2, class00500 var3, float var4) {
      if (this.y != null) {
         this.y.N(var1, var2, var3, var4);
      }
   }

   public void N(@Nullable class03448 var1, @Nullable class07089 var2) {
      if (this.y != null && var2 != null && var1 != null) {
         this.y.N(var1, var2);
      }
   }

   public boolean R() {
      return (class03443)this.N.T_2 == null ? false : ((class03443)this.N.T_2).U() == class07282.field_9215;
   }
}
