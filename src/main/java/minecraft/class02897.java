package minecraft;

public record class02897<T extends class00381<?>>(class00423 flow, class01894 id) {
   public class02897(class00423 flow, class01894 id) {
      this.flow = flow;
      this.id = id;
   }

   @Override
   public String toString() {
      return this.flow.y() + "/" + this.id;
   }

   public class01894 y() {
      return this.id;
   }

   public class00423 N() {
      return this.flow;
   }
}
