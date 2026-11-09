package minecraft;

public record class08637<T extends class06271>(T adultModel, T babyModel) {
   public class08637(T adultModel, T babyModel) {
      super();
      this.adultModel = (T)adultModel;
      this.babyModel = (T)babyModel;
   }

   public T y() {
      return this.babyModel;
   }

   public T N() {
      return this.adultModel;
   }

   public T N(boolean var1) {
      return var1 ? this.babyModel : this.adultModel;
   }
}
