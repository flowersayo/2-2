#include <iostream>
#define MAX(a,b) (a>b ? a:b)
#define MAX_DEGREE 101

using namespace std;

typedef struct {

	int degree; //����
	float coef[MAX_DEGREE]; // �׵��� ��� 


}polynomial;

polynomial add(polynomial A, polynomial B) {


	polynomial C;
	int Apos = 0, Bpos = 0, Cpos = 0;
	int degree_A = A.degree;
	int degree_B = B.degree;
	C.degree = MAX(A.degree, B.degree); //C�� ���� = A,B�� �ְ�����

	while (Apos <= A.degree && Bpos <= B.degree) {


		if (degree_A > degree_B) // A�� ������ �� ũ�ٸ�
		{
			C.coef[Cpos++] = A.coef[Apos++]; //A���� C�׿� �ű��.
			degree_A--;

		}
		else if (degree_A > degree_B) //������ ���ٸ�
		{

			C.coef[Cpos++] = A.coef[Apos++] + B.coef[Bpos++];
			degree_A--;
			degree_B--;
		}
		else // B�� ������ �� ũ�ٸ�
		{
			C.coef[Cpos++] = B.coef[Bpos++]; //A���� C�׿� �ű��.
			degree_B--;

		}
	}
		return C;
}

int main() {


	polynomial A = { 5,{3,6,0,0,0,10} };
	polynomial B = {4,{7,0,5,0,1} };
	polynomial C = add(A, B);

}