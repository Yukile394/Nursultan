package minecraft;

public record class06359(class01894 id, boolean tag) {
   public String L() {
      return this.tag ? "#" + this.id : this.id.toString();
   }

   public class06359(class01894 id, boolean tag) {
      this.id = id;
      this.tag = tag;
   }

   @Override
   public String toString() {
      return this.L();
   }

   public boolean y() {
      return this.tag;
   }

   public class01894 N() {
      return this.id;
   }
}
