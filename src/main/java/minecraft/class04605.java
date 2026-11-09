package minecraft;

class class04605 extends class04596 {
   static final int y = 30;

   @Override
   public boolean M() {
      if (this.L.o() >= 10) {
         return false;
      } else {
         return class04626.Y(this.L).z() < 0.3F ? false : this.L.NI() && this.L.Ng();
      }
   }

   class04605(class04626 var1) {
      super(var1);
      this.L = var1;
   }

   @Override
   public boolean Z() {
      return this.M();
   }

   @Override
   public void i() {
      if (class04626.Q(this.L).y(this.N(30)) == 0) {
         for (int i = 1; i <= 2; i++) {
            class07209 class07209 = this.L.method_24515().method_10087(i);
            class00500 class00500x = this.L.method_73183().method_8320(class07209);
            class00891 class00891 = class00500x.i();
            class00500 class00500x = null;
            if (class00500x.N(class01210.Nx)) {
               if (class00891 instanceof class06772 class06772) {
                  if (!class06772.E(class00500x)) {
                     class00500x = class06772.y(class06772.U(class00500x) + 1);
                  }
               } else if (class00891 instanceof class07728) {
                  int k = class00500x.L(class07728.L);
                  if (k < 7) {
                     class00500x = class00500x.y(class07728.L, k + 1);
                  }
               } else if (class00500x.N(class00869.sM)) {
                  int j = class00500x.L(class05253.L);
                  if (j < 3) {
                     class00500x = class00500x.y(class05253.L, j + 1);
                  }
               } else if (class00500x.N(class00869.vA) || class00500x.N(class00869.vf)) {
                  class00873 class00873 = (class00873)class00500x.i();
                  if (class00873.N((class05487)this.L.method_73183(), class07209, class00500x)) {
                     class00873.N((class04782)this.L.method_73183(), class04626.O(this.L), class07209, class00500x);
                     class00500x = this.L.method_73183().method_8320(class07209);
                  }
               }

               if (class00500x != null) {
                  this.L.method_73183().N(2011, class07209, 15);
                  this.L.method_73183().method_8501(class07209, class00500x);
                  this.L.NQ();
               }
            }
         }
      }
   }
}
