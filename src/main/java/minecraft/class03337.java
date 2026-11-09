package minecraft;

import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public interface class03337 {
   class03337 N = N(0.0F, 0.0F, 0.0F);
   class03337 L = N((class03326)(var0 -> -var0.z()));

   int[] sort(class06607 var1);

   private static class03337 N_38(class03337 var0) {
      return VertexSorters.orthographicZ();
   }

   static class03337 N(class03326 var0) {
      return VertexSorters.fallback(var0);
   }

   static class03337 N(float var0, float var1, float var2) {
      return VertexSorters.distance(var0, var1, var2);
   }

   static class03337 N(Vector3fc var0) {
      return N(var0::distanceSquared);
   }
}
