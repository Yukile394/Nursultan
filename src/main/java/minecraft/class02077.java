package minecraft;

import Nursultan.class09559;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class class02077 extends class02040 {
   private final List<class09559> L = new ArrayList<>();
   private int u;
   private int i;
   private final class02072 R = class02072.Z().N(0.5F, 0.5F);

   public class02072 L() {
      return this.R;
   }

   public class02077() {
      this(0, 0, 0, 0);
   }

   public class02077(int var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
      this.N(var3, var4);
   }

   public class02077(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public class02072 y() {
      return this.R.M();
   }

   public class02077 y(int var1) {
      this.u = var1;
      return this;
   }

   public static void N(class02102 var0, class03255 var1, float var2, float var3) {
      N(var0, var1.u(), var1.y(), var1.M(), var1.B(), var2, var3);
   }

   public static void N(class02102 var0, class03255 var1) {
      N(var0, var1.R().N(), var1.R().y(), var1.M(), var1.B());
   }

   public static void N(class02102 var0, int var1, int var2, int var3, int var4) {
      N(var0, var1, var2, var3, var4, 0.5F, 0.5F);
   }

   @Override
   public void N(Consumer<class02102> var1) {
      this.L.forEach(var1x -> var1.accept(var1x.N));
   }

   public static void N(class02102 var0, int var1, int var2, int var3, int var4, float var5, float var6) {
      N(var1, var3, var0.method_25368(), var0::method_46421, var5);
      N(var2, var4, var0.method_25364(), var0::method_46419, var6);
   }

   public static void N(int var0, int var1, int var2, Consumer<Integer> var3, float var4) {
      int ix = (int)class04995.B(var4, 0.0F, var1 - var2);
      var3.accept(var0 + ix);
   }

   public class02077 N(int var1, int var2) {
      return this.y(var1).N(var2);
   }

   public class02077 N(int var1) {
      this.i = var1;
      return this;
   }

   @Override
   public void N() {
      super.N();
      int ix = this.u;
      int j = this.i;

      for (class09559 class09559x : this.L) {
         ix = Math.max(ix, class09559x.y());
         j = Math.max(j, class09559x.N());
      }

      for (class09559 class09559 : this.L) {
         class09559.N(this.method_46426(), ix);
         class09559.y(this.method_46427(), j);
      }

      this.N = ix;
      this.y = j;
   }

   public <T extends class02102> T N(T var1) {
      return this.N((T)var1, this.y());
   }

   public <T extends class02102> T N(T var1, class02072 var2) {
      this.L.add(new class09559(var1, var2));
      return (T)var1;
   }

   public <T extends class02102> T N(T var1, Consumer<class02072> var2) {
      return this.N((T)var1, class07536.N(this.y(), var2));
   }
}
