package minecraft;

public record class01993(class04469 signature, boolean pending) {
   public boolean L() {
      return this.pending;
   }

   public class01993(class04469 signature, boolean pending) {
      this.signature = signature;
      this.pending = pending;
   }

   public class04469 y() {
      return this.signature;
   }

   public class01993 N() {
      return this.pending ? new class01993(this.signature, false) : this;
   }
}
