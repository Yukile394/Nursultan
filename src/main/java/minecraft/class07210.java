package minecraft;

public record class07210(class04782 level, class07209 pos, class00500 state, class07243 blockEntity) {
   public class07209 L() {
      return this.pos;
   }

   public class07210(class04782 level, class07209 pos, class00500 state, class07243 blockEntity) {
      super();
      this.level = level;
      this.pos = pos;
      this.state = state;
      this.blockEntity = blockEntity;
   }

   public class07243 i() {
      return this.blockEntity;
   }

   public class00500 u() {
      return this.state;
   }

   public class04782 y() {
      return this.level;
   }

   public class06889 N() {
      return this.pos.method_46558();
   }
}
