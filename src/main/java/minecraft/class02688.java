package minecraft;

import java.util.concurrent.Executor;

public record class02688(
   class04782 level, class08088 generator, class01224 structureManager, class04775 lightEngine, Executor mainThreadExecutor, class00568 unsavedListener
) {
   public class01224 L() {
      return this.structureManager;
   }

   public class02688(
      class04782 level, class08088 generator, class01224 structureManager, class04775 lightEngine, Executor mainThreadExecutor, class00568 unsavedListener
   ) {
      this.level = level;
      this.generator = generator;
      this.structureManager = structureManager;
      this.lightEngine = lightEngine;
      this.mainThreadExecutor = mainThreadExecutor;
      this.unsavedListener = unsavedListener;
   }

   public Executor i() {
      return this.mainThreadExecutor;
   }

   public class04775 u() {
      return this.lightEngine;
   }

   public class08088 y() {
      return this.generator;
   }

   public class04782 N() {
      return this.level;
   }

   public class00568 R() {
      return this.unsavedListener;
   }
}
