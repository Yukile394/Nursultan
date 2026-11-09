package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.Mesh;
import net.fabricmc.fabric.api.renderer.v1.model.MeshBakedGeometry;

@Environment(EnvType.CLIENT)
public record class08845(class01894 model, List<class08843> tints) implements class08895 {
   public static final MapCodec<class08845> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class01894.N.fieldOf("model").forGetter(class08845::N), class08835.y.listOf().optionalFieldOf("tints", List.of()).forGetter(class08845::y)
         )
         .apply(var0, class08845::new)
   );

   public class08845(class01894 model, List<class08843> tints) {
      super();
      this.model = model;
      this.tints = tints;
   }

   public List<class08843> y() {
      return this.tints;
   }

   private class08808 N(class08808 var1, class08905 var2, LocalRef var3) {
      Mesh mesh = (Mesh)var3.get();
      if (mesh != null) {
         var1.fabric_setMesh(mesh, var2.N().y());
      }

      return var1;
   }

   private class08496 N(class08496 var1, LocalRef var2) {
      if (var1 instanceof MeshBakedGeometry meshbakedgeometry) {
         var2.set(meshbakedgeometry.getMesh());
      }

      return var1;
   }

   public class01894 N() {
      return this.model;
   }

   @Override
   public void method_62326(class08350 var1) {
      var1.markDependency(this.model);
   }

   @Override
   public MapCodec<class08845> method_65585() {
      return N;
   }

   @Override
   public class08910 method_65587(class08905 var1) {
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(null);
      class02028 class02028 = var1.N();
      class08529 class08529 = class02028.N(this.model);
      class08838 class08838 = class08529.B();
      List list = this.N(class08529.N(class08838, class02028, class08510.N), localrefimpl).method_68048();
      class08517 class08517 = class08517.N(class02028, class08529, class08838);
      Function function = class08808.y(list);
      return this.N(new class08808(this.tints, list, class08517, function), var1, localrefimpl);
   }
}
