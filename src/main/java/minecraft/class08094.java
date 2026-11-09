package minecraft;

import java.util.List;

public record class08094(List<class04306<class00891>> blocks, List<class04306<class04651>> fluids) {
   public class08094(List<class04306<class00891>> blocks, List<class04306<class04651>> fluids) {
      super();
      this.blocks = blocks;
      this.fluids = fluids;
   }

   public List<class04306<class04651>> y() {
      return this.fluids;
   }

   public List<class04306<class00891>> N() {
      return this.blocks;
   }
}
