package minecraft;

import Nursultan.class10213;
import com.mojang.serialization.Codec;

public interface class03877 {
   Codec<class03877> u = class03865.L;
   Codec<class03556<class03877>> i = class01281.N(class04227.yy, u);
   Codec<class03877> R = i.xmap(class03885::new, var0 -> (class03556)(var0 instanceof class03885 ? ((class03885)var0).u() : new class10213<>(var0)));

   class03979<? extends class03877> L();

   default class03877 M() {
      return class03865.N(this, class03891.field_36556);
   }

   default class03877 B() {
      return class03865.N(this, class03891.field_36557);
   }

   default class03877 Z() {
      return class03865.N(this, class03891.field_36558);
   }

   default class03877 U() {
      return class03865.N(this, class03891.field_61470);
   }

   default class03877 z() {
      return class03865.N(this, class03891.field_36559);
   }

   double y();

   default class03877 E() {
      return class03865.N(this, class03891.field_36560);
   }

   double N(class03875 var1);

   default class03877 N(double var1, double var3) {
      return new class03900(this, var1, var3);
   }

   class03877 N(class03881 var1);

   void N(double[] var1, class03912 var2);

   double N();

   default class03877 R() {
      return class03865.N(this, class03891.field_36555);
   }
}
