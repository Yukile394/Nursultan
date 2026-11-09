package minecraft;

record class08114(class05946<class05074> lootTable, class07078<?> entityType, class06581 item) {

   public class06581 L() {
      return this.item;
   }

   class08114(class05946<class05074> lootTable, class07078<?> entityType, class06581 item) {
      this.lootTable = lootTable;
      this.entityType = entityType;
      this.item = item;
   }

   public class07078<?> y() {
      return this.entityType;
   }

   public class05946<class05074> N() {
      return this.lootTable;
   }
}
