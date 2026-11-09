package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05205 extends class05096 {
   private static final Logger u = LogUtils.getLogger();
   public static final class05934 N = new class05934("test1".hashCode(), true, false);
   protected final class05096 y;
   private final class03686 i = new class03686(this, 8 + 9 + 8 + 20 + 4, 60);
   @Nullable
   private class05362 R;
   @Nullable
   private class05362 M;
   @Nullable
   private class05362 B;
   @Nullable
   private class05362 Z;
   @Nullable
   protected class04927 L;
   @Nullable
   private class05231 z;

   public class05205(class05096 var1) {
      super(class00392.L("selectWorld.title"));
      this.y = var1;
   }

   private class05362 N() {
      return class05362.method_46430(
            class00392.y("DEBUG recreate"),
            var1 -> {
               try {
                  String s = "DEBUG world";
                  if (this.z != null && !this.z.method_25396().isEmpty()) {
                     class05978 class05978 = this.z.method_25396().getFirst();
                     if (class05978 instanceof class05944 class05944 && class05944.Z().equals("DEBUG world")) {
                        class05944.u();
                     }
                  }

                  class07312 class07312 = new class07312(
                     "DEBUG world", class07282.field_9219, false, class07086.field_5802, true, new class07305(class03776.u.y()), class03776.u
                  );
                  String s1 = class06290.N(this.field_22787.NL().L(), "DEBUG world", "");
                  this.field_22787.S().N(s1, class07312, N, class05964::N, this);
               } catch (IOException ioexception) {
                  u.error("Failed to recreate the debug world", ioexception);
               }
            }
         )
         .N(72)
         .N();
   }

   public void N(@Nullable class06434 var1) {
      if (this.M != null && this.B != null && this.Z != null && this.R != null) {
         if (var1 == null) {
            this.M.method_25355(class06434.N);
            this.M.field_22763 = false;
            this.B.field_22763 = false;
            this.Z.field_22763 = false;
            this.R.field_22763 = false;
         } else {
            this.M.method_25355(var1.v());
            this.M.field_22763 = var1.n();
            this.B.field_22763 = var1.G();
            this.Z.field_22763 = var1.l();
            this.R.field_22763 = var1.d();
         }
      }
   }

   private void N(Consumer<class05944> var1, class05231 var2) {
      class02060 class02060 = this.i.y(new class02060().N(8).y(4));
      class02060.L().y();
      class02080 class02080 = class02060.u(4);
      this.M = class02080.N(class05362.method_46430(class06434.N, var2x -> var2.L().ifPresent(var1)).N(), 2);
      class02080.N(class05362.method_46430(class00392.L("selectWorld.create"), var2x -> class05213.N(this.field_22787, var2::u)).N(), 2);
      this.B = class02080.N(class05362.method_46430(class00392.L("selectWorld.edit"), var1x -> var2.L().ifPresent(class05944::i)).N(71).N());
      this.R = class02080.N(class05362.method_46430(class00392.L("selectWorld.delete"), var1x -> var2.L().ifPresent(class05944::L)).N(71).N());
      this.Z = class02080.N(class05362.method_46430(class00392.L("selectWorld.recreate"), var1x -> var2.L().ifPresent(class05944::R)).N(71).N());
      class02080.N(class05362.method_46430(class05220.U, var1x -> this.field_22787.N(this.y)).N(71).N());
   }

   @Override
   public void method_25426() {
      class01885 class01885x = this.i.N(class01885.u().N(4));
      class01885x.L().y();
      class01885x.N(new class02071(this.field_22785, this.field_22793));
      class01885 class01885x = class01885x.N(class01885.i().N(4));
      if (class07529.Nc) {
         class01885x.N(this.N());
      }

      this.L = class01885x.N(new class04927(this.field_22793, this.field_22789 / 2 - 100, 22, 200, 20, this.L, class00392.L("selectWorld.search")));
      this.L.method_1863(var1x -> {
         if (this.z != null) {
            this.z.N(var1x);
         }
      });
      this.L.method_47404(class00392.L("gui.selectWorld.search").y(class04927.field_62466));
      Consumer consumer = class05944::y;
      this.z = this.i.L(new class05190(this.field_22787, this).N(this.field_22789).y(this.i.u()).N(this.L.method_1882()).N(this.z).N(this::N).y(consumer).y());
      this.N(consumer, this.z);
      this.i.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
      this.N(null);
   }

   @Override
   protected void method_56131() {
      if (this.L != null) {
         this.method_48265(this.L);
      }
   }

   @Override
   public void method_48640() {
      if (this.z != null) {
         this.z.method_57712(this.field_22789, this.i);
      }

      this.i.N();
   }

   @Override
   public void method_25432() {
      if (this.z != null) {
         this.z.method_25396().forEach(class05978::close);
      }
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.y);
   }
}
