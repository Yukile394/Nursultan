package minecraft;

record class07073(class01894 id, double amount, class07463 operation) {
   public class07463 L() {
      return this.operation;
   }

   class07073(class01894 id, double amount, class07463 operation) {
      this.id = id;
      this.amount = amount;
      this.operation = operation;
   }

   public double y() {
      return this.amount;
   }

   public class01894 N() {
      return this.id;
   }

   public class07471 N(int var1) {
      return new class07471(this.id, this.amount * (var1 + 1), this.operation);
   }
}
