package minecraft;

import com.google.common.base.Suppliers;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.impl.renderer.BasicItemModelExtension;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class08808 implements class08910, BasicItemModelExtension {
   private static final Function<class06584, class07311> N = var0 -> class05911.z();
   private static final Function<class06584, class07311> y = var0 -> {
      class06581 class06581 = var0.B();
      if (class06581 instanceof class06918) {
         class08743 class08743 = class05885.N(((class06918)class06581).L().W());
         if (class08743 != class08743.field_60926) {
            return class05911.Z();
         }
      }

      return class05911.U();
   };
   private final List<class08843> L;
   private final List<class02022> u;
   private final Supplier<Vector3fc[]> i;
   private final class08517 R;
   private boolean M;
   private final Function<class06584, class07311> B;
   @Nullable
   private Mesh Z;

   class08808(List<class08843> var1, List<class02022> var2, class08517 var3, Function<class06584, class07311> var4) {
      super();
      this.L = var1;
      this.u = var2;
      this.R = var3;
      this.B = var4;
      this.i = Suppliers.memoize(() -> N(this.u));
      boolean flag = false;
      Iterator iterator = var2.iterator();

      while (iterator.hasNext()) {
         if (((class02022)iterator.next()).E().method_45851().method_73020()) {
            flag = true;
            break;
         }
      }

      this.M = flag;
   }

   static Function<class06584, class07311> y(List<class02022> var0) {
      Iterator iterator = var0.iterator();
      if (!iterator.hasNext()) {
         return N;
      } else {
         class01894 class01894x = ((class02022)iterator.next()).E().method_45852();

         while (iterator.hasNext()) {
            class01894 class01894x = ((class02022)iterator.next()).E().method_45852();
            if (!class01894x.equals(class01894x)) {
               throw new IllegalStateException("Multiple atlases used in model, expected " + class01894x + ", but also got " + class01894x);
            }
         }

         if (class01894x.equals(class08626.y)) {
            return N;
         } else if (class01894x.equals(class08626.N)) {
            return y;
         } else {
            throw new IllegalArgumentException("Atlas " + class01894x + " can't be usef for item models");
         }
      }
   }

   public static Vector3fc[] N(List<class02022> var0) {
      HashSet hashset = new HashSet();

      for (class02022 class02022 : var0) {
         for (int ix = 0; ix < 4; ix++) {
            hashset.add(class02022.N(ix));
         }
      }

      return hashset.toArray(Vector3fc[]::new);
   }

   private void N(
      class08898 var1,
      class06584 var2,
      class08943 var3,
      class03662 var4,
      @Nullable class03448 var5,
      @Nullable class08961 var6,
      int var7,
      CallbackInfo var8,
      class08931 var9
   ) {
      if (this.Z != null) {
         class06581 class06581 = var2.B();
         class08743 class08743;
         if (class06581 instanceof class06918) {
            class08743 = class05885.N(((class06918)class06581).L().W());
         } else {
            class08743 = class08743.field_60926;
         }

         var9.setRenderTypeGetter((var1x, var2x) -> {
            return switch (var1x) {
               case BLOCK -> {
                  if (var2x == null) {
                     var2x = class08743;
                  }

                  yield var2x != class08743.field_60926 ? class05911.Z() : class05911.U();
               }
               case ITEM -> class05911.z();
               default -> throw new MatchException(null, null);
            };
         });
         this.Z.outputTo(var9.emitter());
      }
   }

   private static boolean N(class06584 var0) {
      return var0.N(class01226.yX) || var0.N(class06570.vN);
   }

   public void fabric_setMesh(Mesh var1, class02601 var2) {
      this.Z = var1;
      if (!this.M) {
         var1.forEach(
            var2x -> {
               if (!this.M) {
                  class08915 class08915 = var2x.glint();
                  if (class08915 != null && class08915 != class08915.field_55341
                     || var2.spriteFinder(var2x.atlas().getTextureId()).find(var2x).method_45851().method_73020()) {
                     this.M = true;
                  }
               }
            }
         );
      }
   }

   @Override
   public void method_65584(class08898 var1, class06584 var2, class08943 var3, class03662 var4, @Nullable class03448 var5, @Nullable class08961 var6, int var7) {
      var1.N(this);
      class08931 class08931 = var1.N();
      if (var2.Q()) {
         class08915 class08915 = N(var2) ? class08915.field_55343 : class08915.field_55342;
         class08931.N(class08915);
         var1.L();
         var1.N(class08915);
      }

      int k = this.L.size();
      int[] aint = class08931.N(k);

      for (int ix = 0; ix < k; ix++) {
         int j = this.L.get(ix).N(var2, var5, var6 == null ? null : var6.method_72393());
         aint[ix] = j;
         var1.N(Integer.valueOf(j));
      }

      class08931.N(this.i);
      class08931.N(this.B.apply(var2));
      this.R.N(class08931, var4);
      class08931.y().addAll(this.u);
      if (this.M) {
         var1.L();
      }

      this.N(var1, var2, var3, var4, var5, var6, var7, null, class08931);
   }
}
