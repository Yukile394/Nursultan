package minecraft;

import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public record class02237(class00549 targetStatus, class02209 directDependencies, class02209 accumulatedDependencies, int blockStateWriteRadius, class00574 task) {

   public class02209 L() {
      return this.accumulatedDependencies;
   }

   public class02237(class00549 targetStatus, class02209 directDependencies, class02209 accumulatedDependencies, int blockStateWriteRadius, class00574 task) {
      this.targetStatus = targetStatus;
      this.directDependencies = directDependencies;
      this.accumulatedDependencies = accumulatedDependencies;
      this.blockStateWriteRadius = blockStateWriteRadius;
      this.task = task;
   }

   public class00574 i() {
      return this.task;
   }

   public int u() {
      return this.blockStateWriteRadius;
   }

   public class02209 y() {
      return this.directDependencies;
   }

   public int N(class00549 var1) {
      return var1 == this.targetStatus ? 0 : this.accumulatedDependencies.N(var1);
   }

   private class08050 N(class08050 var1, @Nullable class03299 var2) {
      if (var1 instanceof class07361 class07361 && class07361.E().u(this.targetStatus)) {
         class07361.N(this.targetStatus);
      }

      if (var2 != null) {
         var2.finish(true);
      }

      return var1;
   }

   public class00549 N() {
      return this.targetStatus;
   }

   public CompletableFuture<class08050> N(class02688 var1, class02248<class02236> var2, class08050 var3) {
      if (var3.E().u(this.targetStatus)) {
         class03299 class03299 = class01834.M.N(var3.R(), var1.N().method_27983(), this.targetStatus.R());
         return this.task.doWork(var1, this, var2, var3).thenApply(var2x -> this.N(var2x, class03299));
      } else {
         return this.task.doWork(var1, this, var2, var3);
      }
   }
}
