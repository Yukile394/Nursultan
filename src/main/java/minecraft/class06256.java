package minecraft;

import java.util.List;

public record class06256(long chunkPos, List<Runnable> tasks) {
   public class06256(long chunkPos, List<Runnable> tasks) {
      super();
      this.chunkPos = chunkPos;
      this.tasks = tasks;
   }

   public List<Runnable> y() {
      return this.tasks;
   }

   public long N() {
      return this.chunkPos;
   }
}
