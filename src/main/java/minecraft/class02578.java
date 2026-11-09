package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat.IndexType;
import it.unimi.dsi.fastutil.ints.IntConsumer;
import org.apache.commons.lang3.mutable.MutableLong;
import org.lwjgl.system.MemoryUtil;

public record class02578(class06607 centroids, IndexType indexType) {
   public class02578(class06607 centroids, IndexType indexType) {
      super();
      this.centroids = centroids;
      this.indexType = indexType;
   }

   public IndexType y() {
      return this.indexType;
   }

   private IntConsumer N(long var1, IndexType var3) {
      MutableLong mutablelong = new MutableLong(var1);

      return switch (var3) {
         case SHORT -> var1x -> MemoryUtil.memPutShort(mutablelong.getAndAdd(2L), (short)var1x);
         case INT -> var1x -> MemoryUtil.memPutInt(mutablelong.getAndAdd(4L), var1x);
         default -> throw new MatchException(null, null);
      };
   }

   public class06607 N() {
      return this.centroids;
   }

   public class02613 N(class02579 var1, class03337 var2) {
      int[] aint = var2.sort(this.centroids);
      long i = var1.y(aint.length * 6 * this.indexType.size);
      IntConsumer intconsumer = this.N(i, this.indexType);

      for (int j : aint) {
         intconsumer.accept(j * 4 + 0);
         intconsumer.accept(j * 4 + 1);
         intconsumer.accept(j * 4 + 2);
         intconsumer.accept(j * 4 + 2);
         intconsumer.accept(j * 4 + 3);
         intconsumer.accept(j * 4 + 0);
      }

      return var1.N();
   }
}
