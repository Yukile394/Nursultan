package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import com.mojang.blaze3d.vertex.VertexFormat.IndexType;

public record class02583(VertexFormat format, int vertexCount, int indexCount, DrawMode mode, IndexType indexType) {
   public int L() {
      return this.indexCount;
   }

   public class02583(VertexFormat format, int vertexCount, int indexCount, DrawMode mode, IndexType indexType) {
      this.format = format;
      this.vertexCount = vertexCount;
      this.indexCount = indexCount;
      this.mode = mode;
      this.indexType = indexType;
   }

   public IndexType i() {
      return this.indexType;
   }

   public DrawMode u() {
      return this.mode;
   }

   public int y() {
      return this.vertexCount;
   }

   public VertexFormat N() {
      return this.format;
   }
}
