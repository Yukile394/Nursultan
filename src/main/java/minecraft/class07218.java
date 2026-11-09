package minecraft;

public class class07218 extends class07209 {
   public class07218 method_20788(int var1) {
      super.method_20788(var1);
      return this;
   }

   @Override
   public class07209 method_10062() {
      return new class07209(this);
   }

   public class07218() {
      this(0, 0, 0);
   }

   public class07218(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public class07218(double var1, double var3, double var5) {
      this(class04995.N(var1), class04995.N(var3), class04995.N(var5));
   }

   public class07218 y(int var1, int var2, int var3) {
      return this.N(this.method_10263() + var1, this.method_10264() + var2, this.method_10260() + var3);
   }

   public class07218 method_10099(int var1) {
      super.method_10099(var1);
      return this;
   }

   public class07218 y(class00753 var1) {
      return this.N(this.method_10263() + var1.method_10263(), this.method_10264() + var1.method_10264(), this.method_10260() + var1.method_10260());
   }

   public class07218 N(class00753 var1, class00753 var2) {
      return this.N(var1.method_10263() + var2.method_10263(), var1.method_10264() + var2.method_10264(), var1.method_10260() + var2.method_10260());
   }

   public class07218 N(class07211 var1) {
      return this.N(var1, 1);
   }

   public class07218 N(class07211 var1, int var2) {
      return this.N(this.method_10263() + var1.P() * var2, this.method_10264() + var1.s() * var2, this.method_10260() + var1.T() * var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public class07218 N(class07185 var1, int var2, int var3) {
      return switch (var1) {
         case field_11048 -> this.N(class04995.N(this.method_10263(), var2, var3), this.method_10264(), this.method_10260());
         case field_11052 -> this.N(this.method_10263(), class04995.N(this.method_10264(), var2, var3), this.method_10260());
         case field_11051 -> this.N(this.method_10263(), this.method_10264(), class04995.N(this.method_10260(), var2, var3));
      };
   }

   public class07218 method_20787(int var1) {
      super.method_20787(var1);
      return this;
   }

   public class07218 N(class00753 var1, int var2, int var3, int var4) {
      return this.N(var1.method_10263() + var2, var1.method_10264() + var3, var1.method_10260() + var4);
   }

   public class07218 N(class00753 var1) {
      return this.N(var1.method_10263(), var1.method_10264(), var1.method_10260());
   }

   public class07218 N(double var1, double var3, double var5) {
      return this.N(class04995.N(var1), class04995.N(var3), class04995.N(var5));
   }

   public class07218 N(long var1) {
      return this.N(method_10061(var1), method_10071(var1), method_10083(var1));
   }

   public class07218 N(class07214 var1, int var2, int var3, int var4) {
      return this.N(
         var1.N(var2, var3, var4, class07185.field_11048), var1.N(var2, var3, var4, class07185.field_11052), var1.N(var2, var3, var4, class07185.field_11051)
      );
   }

   public class07218 N(class00753 var1, class07211 var2) {
      return this.N(var1.method_10263() + var2.P(), var1.method_10264() + var2.s(), var1.method_10260() + var2.T());
   }

   public class07218 N(int var1, int var2, int var3) {
      this.method_20787(var1);
      this.method_10099(var2);
      this.method_20788(var3);
      return this;
   }

   @Override
   public class07209 method_10079(class07211 var1, int var2) {
      return super.method_10079(var1, var2).method_10062();
   }

   @Override
   public class07209 method_35830(int var1) {
      return super.method_35830(var1).method_10062();
   }

   @Override
   public class07209 method_10069(int var1, int var2, int var3) {
      return super.method_10069(var1, var2, var3).method_10062();
   }

   @Override
   public class07209 method_30513(class07185 var1, int var2) {
      return super.method_30513(var1, var2).method_10062();
   }

   @Override
   public class07209 method_10070(class06993 var1) {
      return super.method_10070(var1).method_10062();
   }
}
