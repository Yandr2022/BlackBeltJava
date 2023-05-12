package Part2_Generics.lesson6_TypeErasure;

import java.util.List;

public class OverloadOverrideMethsWithGenericParam {
    public void foo(List<Integer> integers){}
//    public void foo(List<String> strings){} overloading is not possible due to the erasure of Generic types
}
class A{
    public void foo(List<Integer> integers){}

}

class B extends A{

//    @Override
//    public void foo(List<String> integers) {    *'foo(List<String>) in B clashes with 'foo(List<Integer>)' in A;
//        super.foo(integers);                     *both methods have same erasure, yet neither overrides the other
//    }

}