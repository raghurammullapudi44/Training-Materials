#include <stdio.h>

struct student
{
    char name[50];
    int age;
};

void Display(struct student *);
void Accept(struct student *);

int main()
{
    struct student s1;
    Accept(&s1);
    Display(&s1);   // passing structure variable s1 as argument
    return 0;
}

void Accept(struct student *stu)
{
    printf("Enter student's name: ");
    scanf("%s",stu->name);
    printf("Enter age:");
    scanf("%d",&stu->age);
}

void Display(struct student *stu){
  printf("Output\nName: %s",stu->name);
  printf("\nage: %d",stu->age);
}
