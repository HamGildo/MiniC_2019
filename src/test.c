int sum(int cnt) {
int result = 0;
int i = 0;
while(i < cnt) {
result = 1 + result;
i = i + 1;
}
return result;
}
void main() {
int s = 0;
s = sum(10);
_print(s);
return ;
}