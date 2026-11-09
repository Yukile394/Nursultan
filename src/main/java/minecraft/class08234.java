package minecraft;

import org.jspecify.annotations.Nullable;

public record class08234(class08731 type, boolean keepEquipment, boolean preserveCanPickUpLoot, class00502 team) {
   public boolean L() {
      return this.preserveCanPickUpLoot;
   }

   public class08234(class08731 type, boolean keepEquipment, boolean preserveCanPickUpLoot, @Nullable class00502 team) {
      super();
      this.type = type;
      this.keepEquipment = keepEquipment;
      this.preserveCanPickUpLoot = preserveCanPickUpLoot;
      this.team = team;
   }

   @Nullable
   public class00502 u() {
      return this.team;
   }

   public boolean y() {
      return this.keepEquipment;
   }

   public static class08234 N(class07079 var0, boolean var1, boolean var2) {
      return new class08234(class08731.field_54080, var1, var2, var0.method_5781());
   }

   public class08731 N() {
      return this.type;
   }
}
