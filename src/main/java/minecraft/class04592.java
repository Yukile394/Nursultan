package minecraft;

import java.util.Comparator;

class class04592 implements Comparator<class04590> {
   class04592(class04611 var1) {
      super();
      this.N = var1;
   }

   public int compare(class04590 var1, class04590 var2) {
      class06581 class06581x = var1.N();
      class06581 class06581x = var2.N();
      int i;
      int j;
      if (this.N.u == null) {
         i = 0;
         j = 0;
      } else if (this.N.N.contains(this.N.u)) {
         class04922<?> class04922 = this.N.u;
         i = class06581x instanceof class06918 ? this.N.R.B.N(class04922, ((class06918)class06581x).L()) : -1;
         j = class06581x instanceof class06918 ? this.N.R.B.N(class04922, ((class06918)class06581x).L()) : -1;
      } else {
         class04922<?> class04922 = this.N.u;
         i = this.N.R.B.N(class04922, class06581x);
         j = this.N.R.B.N(class04922, class06581x);
      }

      return i == j ? this.N.i * Integer.compare(class06581.N(class06581x), class06581.N(class06581x)) : this.N.i * Integer.compare(i, j);
   }
}
