package minecraft;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class01950 extends class05096 {
   private static final class00392 N = class00392.L("selectWorld.experiments");
   private static final class00392 y = class00392.L("selectWorld.experiments.info").N(class06541.field_1061);
   private static final int L = 310;
   private static final int u = 130;
   private final class03686 i = new class03686(this);
   private final class05096 R;
   private final class01623 M;
   private final Consumer<class01623> B;
   private final Object2BooleanMap<class01055> Z = new Object2BooleanLinkedOpenHashMap();
   @Nullable
   private class00104 z;

   public class01950(class05096 var1, class01623 var2, Consumer<class01623> var3) {
      super(N);
      this.R = var1;
      this.M = var2;
      this.B = var3;

      for (class01055 class01055 : var2.u()) {
         if (class01055.E() == class01283.u) {
            this.Z.put(class01055, var2.M().contains(class01055));
         }
      }
   }

   private void N() {
      ArrayList arraylist = new ArrayList<>(this.M.M());
      ArrayList arraylist1 = new ArrayList();
      this.Z.forEach((var2x, var3) -> {
         arraylist.remove(var2x);
         if (var3) {
            arraylist1.add(var2x);
         }
      });
      arraylist.addAll(Lists.reverse(arraylist1));
      this.M.y(arraylist.stream().map(class01055::M).toList());
      this.B.accept(this.M);
   }

   private static class00392 N(class01055 var0) {
      String s = "dataPack." + var0.M() + ".name";
      return (class00392)(class08392.N(s) ? class00392.L(s) : var0.y());
   }

   @Override
   public void method_25426() {
      this.i.N(N, this.field_22793);
      class01885 class01885x = this.i.L(class01885.u());
      class01885x.N(new class04230(y, this.field_22793).N(310), var0 -> var0.i(15));
      class03658 class03658 = class03668.N(299).N(2, true).y(4);
      this.Z.forEach((var2x, var3x) -> class03658.N(N(var2x), () -> this.Z.getBoolean(var2x), var2xx -> this.Z.put(var2x, var2xx)).N(var2x.L()));
      class03695 class03695 = class03658.y().N();
      this.z = new class00104(this.field_22787, class03695, 130);
      this.z.N(310);
      class01885x.N(this.z);
      class01885 class01885x = this.i.y(class01885.i().N(8));
      class01885x.N(class05362.method_46430(class05220.u, var1x -> this.N()).N());
      class01885x.N(class05362.method_46430(class05220.i, var1x -> this.method_25419()).N());
      this.i.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.z.y(130);
      this.i.N();
      int ix = this.field_22790 - this.i.y() - this.z.method_48202().L();
      this.z.y(this.z.method_25364() + ix);
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.R);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(super.method_25435(), y);
   }
}
