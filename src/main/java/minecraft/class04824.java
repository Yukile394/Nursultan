package minecraft;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;
import org.slf4j.Logger;

public class class04824 implements class04836 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 8;
   private static final int L = 64;
   private static final int u = 128;
   private static final class06541 i = class06541.field_1075;
   private static final class06541 R = class06541.field_1060;
   private static final class06541 M = class06541.field_1065;
   private static final class06541 B = class06541.field_1061;
   private static final Pattern Z = Pattern.compile("[A-Za-z0-9._+-]+");
   private static final String z = "[";
   private static final String U = "]";
   private static final String E = ";";
   private static final String W = " ";
   private static final String m = "{";
   private static final String P = "}";
   private static final String s = "\n";
   private static final String T = ": ";
   private static final String b = String.valueOf(',');
   private static final String j = b + "\n";
   private static final String v = b + " ";
   private static final class00392 n = class00392.y("<...>").N(class06541.field_1080);
   private static final class00392 t = class00392.y("b").N(B);
   private static final class00392 G = class00392.y("s").N(B);
   private static final class00392 l = class00392.y("I").N(B);
   private static final class00392 d = class00392.y("L").N(B);
   private static final class00392 w = class00392.y("f").N(B);
   private static final class00392 k = class00392.y("d").N(B);
   private static final class00392 Y = class00392.y("B").N(B);
   private final String Q;
   private int O;
   private int g;
   private final class05216 I = class00392.i();

   public class04824(String var1) {
      super();
      this.Q = var1;
   }

   private static boolean y(class07741 var0) {
      if (var0.size() >= 8) {
         return false;
      } else {
         Iterator<class07709> iterator = var0.iterator();

         while (iterator.hasNext()) {
            if (!(iterator.next() instanceof class07737)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public void N(class07001 var1) {
      if (var1.z()) {
         this.I.i("{}");
      } else if (this.g >= 64) {
         this.I.i("{").y(n).i("}");
      } else {
         this.I.i("{");
         Set<String> set = var1.i();
         if (N.isDebugEnabled()) {
            ArrayList arraylist = Lists.newArrayList(var1.i());
            Collections.sort(arraylist);
            set = arraylist;
         }

         if (!this.Q.isEmpty()) {
            this.I.i("\n");
         }

         String s1 = Strings.repeat(this.Q, this.O + 1);
         Iterator iterator = set.iterator();

         while (iterator.hasNext()) {
            String sx = (String)iterator.next();
            this.I.i(s1).y(N(sx)).i(": ");
            this.N(var1.N(sx), true);
            if (iterator.hasNext()) {
               this.I.i(this.Q.isEmpty() ? v : j);
            }
         }

         if (!this.Q.isEmpty()) {
            this.I.i("\n" + Strings.repeat(this.Q, this.O));
         }

         this.I.i("}");
      }
   }

   @Override
   public void N(class07741 var1) {
      if (var1.isEmpty()) {
         this.I.i("[]");
      } else if (this.g >= 64) {
         this.I.i("[").y(n).i("]");
      } else if (!y(var1)) {
         this.I.i("[");

         for (int jx = 0; jx < var1.size(); jx++) {
            if (jx != 0) {
               this.I.i(v);
            }

            this.N(var1.get(jx), false);
         }

         this.I.i("]");
      } else {
         this.I.i("[");
         if (!this.Q.isEmpty()) {
            this.I.i("\n");
         }

         String sx = Strings.repeat(this.Q, this.O + 1);

         for (int ix = 0; ix < var1.size() && ix < 128; ix++) {
            this.I.i(sx);
            this.N(var1.get(ix), true);
            if (ix != var1.size() - 1) {
               this.I.i(this.Q.isEmpty() ? v : j);
            }
         }

         if (var1.size() > 128) {
            this.I.i(sx).y(n);
         }

         if (!this.Q.isEmpty()) {
            this.I.i("\n" + Strings.repeat(this.Q, this.O));
         }

         this.I.i("]");
      }
   }

   @Override
   public void N(class06995 var1) {
      this.I.i("[").y(l).i(";");
      int[] aint = var1.M();

      for (int ix = 0; ix < aint.length && ix < 128; ix++) {
         this.I.i(" ").y(class00392.y(String.valueOf(aint[ix])).N(M));
         if (ix != aint.length - 1) {
            this.I.i(b);
         }
      }

      if (aint.length > 128) {
         this.I.y(n);
      }

      this.I.i("]");
   }

   @Override
   public void N(class07757 var1) {
      this.I.i("[").y(d).i(";");
      long[] along = var1.M();

      for (int ix = 0; ix < along.length && ix < 128; ix++) {
         class05216 class05216 = class00392.y(String.valueOf(along[ix])).N(M);
         this.I.i(" ").y(class05216).y(d);
         if (ix != along.length - 1) {
            this.I.i(b);
         }
      }

      if (along.length > 128) {
         this.I.y(n);
      }

      this.I.i("]");
   }

   @Override
   public void N(class07029 var1) {
      this.I.i("[").y(Y).i(";");
      byte[] abyte = var1.i();

      for (int ix = 0; ix < abyte.length && ix < 128; ix++) {
         class05216 class05216 = class00392.y(String.valueOf(abyte[ix])).N(M);
         this.I.i(" ").y(class05216).y(Y);
         if (ix != abyte.length - 1) {
            this.I.i(b);
         }
      }

      if (abyte.length > 128) {
         this.I.y(n);
      }

      this.I.i("]");
   }

   @Override
   public void N(class06997 var1) {
   }

   protected static class00392 N(String var0) {
      if (Z.matcher(var0).matches()) {
         return class00392.y(var0).N(i);
      } else {
         String sx = class07707.y(var0);
         String s1 = sx.substring(0, 1);
         class05216 class05216 = class00392.y(sx.substring(1, sx.length() - 1)).N(i);
         return class00392.y(s1).y(class05216).i(s1);
      }
   }

   private void N(class07709 var1, boolean var2) {
      if (var2) {
         this.O++;
      }

      this.g++;

      try {
         var1.N(this);
      } finally {
         if (var2) {
            this.O--;
         }

         this.g--;
      }
   }

   @Override
   public void N(class07720 var1) {
      this.I.y(class00392.y(String.valueOf(var1.m())).N(M));
   }

   @Override
   public void N(class07730 var1) {
      this.I.y(class00392.y(String.valueOf(var1.m())).N(M)).y(G);
   }

   @Override
   public void N(class07037 var1) {
      this.I.y(class00392.y(String.valueOf(var1.m())).N(M)).y(t);
   }

   @Override
   public void N(class07707 var1) {
      String sx = class07707.y(var1.U());
      String s1 = sx.substring(0, 1);
      class05216 class05216 = class00392.y(sx.substring(1, sx.length() - 1)).N(R);
      this.I.i(s1).y(class05216).i(s1);
   }

   public class00392 N(class07709 var1) {
      var1.N(this);
      return this.I;
   }

   @Override
   public void N(class07019 var1) {
      this.I.y(class00392.y(String.valueOf(var1.m())).N(M)).y(k);
   }

   @Override
   public void N(class07009 var1) {
      this.I.y(class00392.y(String.valueOf(var1.m())).N(M)).y(w);
   }

   @Override
   public void N(class07729 var1) {
      this.I.y(class00392.y(String.valueOf(var1.m())).N(M)).y(d);
   }
}
