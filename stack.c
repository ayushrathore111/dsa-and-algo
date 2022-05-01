#include <stdio.h>
#include <stdlib.h>
struct stack{
    int size;
    int top;
    int *arr;
};

int isEmpty(struct stack *s){
    if(s->top==-1){
        return 1;
    }
    return 0;
}
void push(struct stack *s, int val){
    if(isFull(s)){
        printf("stack overflow.......\n");

    }
    s->top++;
    int val = s->arr[s->top];
}
int isFull(struct stack *s){
    if(s->top==s->size-1){
        return 1;
    }
    return 0;
}
int main()
{
    struct stack *s;
    s->size = 80;
    s->top = -1;
    int val;
    s->arr = (int*)malloc(s->size * sizeof(int));
    printf("%d\n", isEmpty(s));
    printf("%d", isFull(s));
    push(s, 55);

    return 0;
}
