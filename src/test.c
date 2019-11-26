int sum(int a){
int result = 0;
result = result + a;
while(a != 0) {
result = result - 1;
-- a;
}
return result;
}
void main() {
int aa = 0;
aa = sum(10);
_print(aa);
return ;
}