package minecraft;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import java.util.Map;

public record class00977(int indexCount, GpuBufferSlice dynamicTransforms, Map<class05846, class00984> layers) {

   public Map<class05846, class00984> L() {
      return this.layers;
   }

   public class00977(int indexCount, GpuBufferSlice dynamicTransforms, Map<class05846, class00984> layers) {
      this.indexCount = indexCount;
      this.dynamicTransforms = dynamicTransforms;
      this.layers = layers;
   }

   public GpuBufferSlice y() {
      return this.dynamicTransforms;
   }

   public int N() {
      return this.indexCount;
   }
}
