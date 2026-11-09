package minecraft;

import java.util.List;

record class00998(List<class00963> states) implements class00972 {
   @Override
   public void submit(class01237 var1, class06959 var2) {
      for (class00963 class00963 : this.states) {
         var1.N(class00963.N(), class06244.field_17274, class00963.y(), class00963.L(), 15728880, class01384.u, class00963.u(), null, 0, null);
      }
   }

   class00998(List<class00963> states) {
      this.states = states;
   }

   public List<class00963> N() {
      return this.states;
   }
}
