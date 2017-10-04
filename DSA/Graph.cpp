#include <iostream>
using namespace std;

void EDGES(int &edges, int mat[][3]){
        int i,j;
        for(i = 0; i<3; ++i) {
                for(j = 0; j<3; ++j) {
                        if(mat[i][j] == 1)
                                ++edges;
                }
        }
}

void in_degree(int indegrees[], int mat[][3]){
        cout<<"INDEGREES \n";

        int i, j;

        for(i = 0; i< 3; ++i) {
                for(j = 0; j<3; ++j) {
                        if(mat[i][j] == 1) {
                                indegrees[j] += 1;
                        }
                }
        }

        for (i = 0; i<3; ++i) {
                cout<<"Vertex "<<i+1 <<" has indegree " << indegrees[i]<< "\n";
        }
}

void out_degree(int outdegrees[], int mat[][3]){
        cout<<"OUTDEGREES \n";

        int i, j;

        for(i = 0; i< 3; ++i) {
                for(j = 0; j<3; ++j) {
                        if(mat[i][j] == 1) {
                                outdegrees[i] += 1;
                        }
                }
        }

        for (i = 0; i<3; ++i) {
                cout<<"Vertex "<<i+1 <<" has outdegree " << outdegrees[i]<< "\n";
        }
}

int main(){
        cout<<"Graphs in C++ \n";
        int mat[][3] = {
                {0,1,0},
                {1,0,1},
                {1,0,0}
        };

        int indegrees[] = {0,0,0};
        int outdegrees[] = {0,0,0};
        int edges(0);

        EDGES(edges, mat);
        cout<<"Edges = "<<edges<<"\n";

        in_degree(indegrees, mat);
        out_degree(outdegrees, mat);

        return 0;
}
