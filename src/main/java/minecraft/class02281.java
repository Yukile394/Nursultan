package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

public record class02281(
   class05946<class05074> lootTable,
   double activationRange,
   double deactivationRange,
   class06584 keyItem,
   Optional<class05946<class05074>> overrideLootTableToDisplay,
   class04514 playerDetector,
   class04488 entitySelector
) {
   static final String N = "config";
   static class02281 y = new class02281();
   static Codec<class02281> L = RecordCodecBuilder.create(
         var0 -> var0.group(
               class05074.N.lenientOptionalFieldOf("loot_table", y.y()).forGetter(class02281::y),
               Codec.DOUBLE.lenientOptionalFieldOf("activation_range", y.L()).forGetter(class02281::L),
               Codec.DOUBLE.lenientOptionalFieldOf("deactivation_range", y.u()).forGetter(class02281::u),
               class06584.N("key_item").forGetter(class02281::i),
               class05074.N.lenientOptionalFieldOf("override_loot_table_to_display").forGetter(class02281::R)
            )
            .apply(var0, class02281::new)
      )
      .validate(class02281::B);

   public double L() {
      return this.activationRange;
   }

   public class04488 M() {
      return this.entitySelector;
   }

   private class02281() {
      this(class06273.F, 4.0, 4.5, new class06584(class06570.Yd), Optional.empty(), class04514.y, class04488.N);
   }

   public class02281(
      class05946<class05074> lootTable,
      double activationRange,
      double deactivationRange,
      class06584 keyItem,
      Optional<class05946<class05074>> overrideLootTableToDisplay,
      class04514 playerDetector,
      class04488 entitySelector
   ) {
      super();
      this.lootTable = lootTable;
      this.activationRange = activationRange;
      this.deactivationRange = deactivationRange;
      this.keyItem = keyItem;
      this.overrideLootTableToDisplay = overrideLootTableToDisplay;
      this.playerDetector = playerDetector;
      this.entitySelector = entitySelector;
   }

   public class02281(class05946<class05074> var1, double var2, double var4, class06584 var6, Optional<class05946<class05074>> var7) {
      this(var1, var2, var4, var6, var7, y.N(), y.M());
   }

   private DataResult<class02281> B() {
      return this.activationRange > this.deactivationRange
         ? DataResult.error(
            () -> "Activation range must (" + this.activationRange + ") be less or equal to deactivation range (" + this.deactivationRange + ")"
         )
         : DataResult.success(this);
   }

   public class06584 i() {
      return this.keyItem;
   }

   public double u() {
      return this.deactivationRange;
   }

   public class05946<class05074> y() {
      return this.lootTable;
   }

   public class04514 N() {
      return class07529.NZ ? class04514.L : this.playerDetector;
   }

   public Optional<class05946<class05074>> R() {
      return this.overrideLootTableToDisplay;
   }
}
