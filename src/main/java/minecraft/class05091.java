package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

class class05091 extends class05729<class05091> {
   private static final int y = 2;
   private final class04948 L;
   @Nullable
   private class05362 u;
   @Nullable
   private class05362 i;
   private final List<class06478> R;

   public class05091(class05094 var1, class04948 var2) {
      super();
      this.N = var1;
      this.R = new ArrayList<>();
      this.L = var2;
      this.N(var2);
      if (!var2.R.isEmpty()) {
         this.i = class05362.method_46430(class05094.L, var1x -> class05094.Z(this.N).N(new class05112(this.N, this.L)))
            .N(8 + class05094.y(var1).N(class05094.L))
            .N(this::N)
            .N();
         this.R.add(this.i);
      }

      if (!var1.z.U) {
         this.u = class05362.method_46430(class05094.y, var1x -> this.N()).N(8 + class05094.L(var1).N(class05094.L)).N(this::N).N();
         this.R.add(this.u);
      }
   }

   private class05216 N(Supplier<class05216> var1) {
      return class05220.N(class00392.N("mco.backup.narration", class05094.u.format(this.L.N())), var1.get());
   }

   private void N() {
      class00392 class00392 = class04601.N(this.L.y);
      String s = class05094.u.format(this.L.N());
      class05216 class05216 = class00392.N("mco.configure.world.restore.question.line1", s, class00392);
      class05094.u(this.N).N(class02252.y(this.N, class05216, var1x -> {
         class05092 class05092 = this.N.i.Z();
         class05094.B(this.N).N(new class04708(class05092, new class04740(this.L, this.N.z.y, class05092)));
      }));
   }

   private void N(String var1) {
      if (var1.contains("uploaded")) {
         String s = class05094.u.format(this.L.N());
         this.L.R.put(var1, s);
         this.L.u = true;
      } else {
         this.L.R.put(var1, this.L.i.get(var1));
      }
   }

   private void N(class04948 var1) {
      int ix = this.N.R.indexOf(var1);
      if (ix != this.N.R.size() - 1) {
         class04948 class04948 = this.N.R.get(ix + 1);

         for (String s : var1.i.keySet()) {
            if (!s.contains("uploaded") && class04948.i.containsKey(s)) {
               if (!var1.i.get(s).equals(class04948.i.get(s))) {
                  this.N(s);
               }
            } else {
               this.N(s);
            }
         }
      }
   }

   @Override
   public List<? extends class04654> method_25396() {
      return this.R;
   }

   @Override
   public List<? extends class03434> method_37025() {
      return this.R;
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int ix = this.method_73385();
      int j = ix - 9 - 2;
      int k = ix + 2;
      int l = this.L.u ? -8388737 : -1;
      var1.y(class05094.R(this.N), class00392.N("mco.backup.entry", class04601.N(this.L.y)), this.method_73380(), j, l);
      var1.y(class05094.M(this.N), class05094.u.format(this.L.N()), this.method_73380(), k, -11776948);
      int i1 = 0;
      int j1 = this.method_73385() - 10;
      if (this.u != null) {
         i1 += this.u.method_25368() + 8;
         this.u.method_46421(this.method_73389() - i1);
         this.u.method_46419(j1);
         this.u.method_25394(var1, var2, var3, var5);
      }

      if (this.i != null) {
         i1 += this.i.method_25368() + 8;
         this.i.method_46421(this.method_73389() - i1);
         this.i.method_46419(j1);
         this.i.method_25394(var1, var2, var3, var5);
      }
   }
}
