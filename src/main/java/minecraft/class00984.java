package minecraft;

public record class00984(int vertexOffset, int indexCount) {

   public class00984(int vertexOffset, int indexCount) {
      super();
      this.vertexOffset = vertexOffset;
      this.indexCount = indexCount;
   }

   public int y() {
      return this.indexCount;
   }

   public int N() {
      return this.vertexOffset;
   }
}
