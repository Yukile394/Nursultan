package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import net.fabricmc.fabric.api.entity.event.v1.effect.FabricMobEffect;
import org.jspecify.annotations.Nullable;

public class class07084 implements class02995, FabricMobEffect {
   public static final Codec<class03556<class07084>> N = class04206.u.b();
   public static final class02362<class04247, class03556<class07084>> y = class02389.y(class04227.Ni);
   private static final int L = class04995.y(38.25F);
   private final Map<class03556<class07468>, class07073> u = new Object2ObjectOpenHashMap();
   private final class01286 i;
   private final int R;
   private final Function<class07055, class07126> M;
   @Nullable
   private String B;
   private int Z;
   private int z;
   private int U;
   private Optional<class04891> E = Optional.empty();
   private class03767 W = class03794.M;

   public int L() {
      return this.z;
   }

   public class00392 M() {
      return class00392.L(this.R());
   }

   public class07084(class01286 var1, int var2) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var1x -> {
         int ix = var1x.R() ? L : 255;
         return class02329.N(class07107.t, class02566.R(ix, var2));
      };
   }

   public class07084(class01286 var1, int var2, class07126 var3) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var1x -> var3;
   }

   public class01286 B() {
      return this.i;
   }

   public int Z() {
      return this.R;
   }

   protected String i() {
      if (this.B == null) {
         this.B = class07536.N("effect", class04206.u.y(this));
      }

      return this.B;
   }

   public boolean z() {
      return this.i == class01286.field_18271;
   }

   public int u() {
      return this.U;
   }

   public void y(class07438 var1, int var2) {
      this.E
         .ifPresent(
            var1x -> var1.method_73183()
               .method_43128(null, var1.method_23317(), var1.method_23318(), var1.method_23321(), var1x, var1.method_5634(), 1.0F, 1.0F)
         );
   }

   public int y() {
      return this.Z;
   }

   public class07126 N(class07055 var1) {
      return this.M.apply(var1);
   }

   public boolean N(class04782 var1, class07438 var2, int var3) {
      return true;
   }

   public void N(class05320 var1, int var2) {
      for (Entry entry : this.u.entrySet()) {
         class07469 class07469 = var1.N((class03556<class07468>)entry.getKey());
         if (class07469 != null) {
            class07469.L(((class07073)entry.getValue()).N());
            class07469.u(((class07073)entry.getValue()).N(var2));
         }
      }
   }

   public void N(class05320 var1) {
      for (Entry entry : this.u.entrySet()) {
         class07469 class07469 = var1.N((class03556<class07468>)entry.getKey());
         if (class07469 != null) {
            class07469.L(((class07073)entry.getValue()).N());
         }
      }
   }

   public class07084 N(class02957... var1) {
      this.W = class03794.i.N(var1);
      return this;
   }

   public class07084 N(class04891 var1) {
      this.E = Optional.of(var1);
      return this;
   }

   public boolean N() {
      return false;
   }

   public void N(class04782 var1, @Nullable class07049 var2, @Nullable class07049 var3, class07438 var4, int var5, double var6) {
      this.N(var1, var4, var5);
   }

   public void N(class04782 var1, class07438 var2, int var3, class07072 var4, float var5) {
   }

   public void N(class04782 var1, class07438 var2, int var3, class07062 var4) {
   }

   public void N(class07438 var1, int var2) {
   }

   public boolean N(int var1, int var2) {
      return false;
   }

   public void N(int var1, BiConsumer<class03556<class07468>, class07471> var2) {
      this.u.forEach((var2x, var3) -> var2.accept(var2x, var3.N(var1)));
   }

   public class07084 N(int var1) {
      return this.N(var1, var1, var1);
   }

   public class07084 N(class03556<class07468> var1, class01894 var2, double var3, class07463 var5) {
      this.u.put(var1, new class07073(var2, var3, var5));
      return this;
   }

   public class07084 N(int var1, int var2, int var3) {
      this.Z = var1;
      this.z = var2;
      this.U = var3;
      return this;
   }

   public String R() {
      return this.i();
   }

   @Override
   public class03767 method_45322() {
      return this.W;
   }
}
