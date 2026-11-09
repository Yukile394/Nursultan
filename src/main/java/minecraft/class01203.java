package minecraft;

import java.util.Locale;
import java.util.Objects;

public record class01203(
   class01228 info, class04853 jointType, class01894 name, class05946<class05281> pool, class01894 target, int placementPriority, int selectionPriority
) {

   public class01894 L() {
      return this.name;
   }

   public int M() {
      return this.selectionPriority;
   }

   public class01203(
      class01228 info, class04853 jointType, class01894 name, class05946<class05281> pool, class01894 target, int placementPriority, int selectionPriority
   ) {
      this.info = info;
      this.jointType = jointType;
      this.name = name;
      this.pool = pool;
      this.target = target;
      this.placementPriority = placementPriority;
      this.selectionPriority = selectionPriority;
   }

   @Override
   public String toString() {
      return String.format(
         Locale.ROOT,
         "<JigsawBlockInfo | %s | %s | name: %s | pool: %s | target: %s | placement: %d | selection: %d | %s>",
         this.info.N(),
         this.info.y(),
         this.name,
         this.pool.N(),
         this.target,
         this.placementPriority,
         this.selectionPriority,
         this.info.L()
      );
   }

   public class01894 i() {
      return this.target;
   }

   public class05946<class05281> u() {
      return this.pool;
   }

   public class04853 y() {
      return this.jointType;
   }

   public class01203 y(class01228 var1) {
      return new class01203(var1, this.jointType, this.name, this.pool, this.target, this.placementPriority, this.selectionPriority);
   }

   public static class01203 N(class01228 var0) {
      class07001 class07001 = Objects.requireNonNull(var0.L(), () -> var0 + " nbt was null");
      return new class01203(
         var0,
         class01207.N(class07001, var0.y()),
         class07001.<class01894>N_15("name", class01894.N).orElse(class04858.y),
         class07001.<class05946<class05281>>N_15("pool", class04858.N).orElse(class01019.N),
         class07001.<class01894>N_15("target", class01894.N).orElse(class04858.y),
         class07001.y("placement_priority", 0),
         class07001.y("selection_priority", 0)
      );
   }

   public class01228 N() {
      return this.info;
   }

   public int R() {
      return this.placementPriority;
   }
}
