

setwd("/home/omer-pc/")
fullData <- read.csv("matchesout.csv",header=TRUE)
setwd("/home/omer-pc/workspace/FootballPredict/data/csv/season-2015-2016")
engData <- read.csv("E0.csv",header=TRUE)

library(kernlab)
install.packages('aod')
library(aod)
install.packages('ggplot2')
library(ggplot2)
install.packages('party')
library("party")
install.packages('randomForest')
library(randomForest)
install.packages('e1071')
library(e1071)

library(caret)
library(NLP)
library(tm)


x<-na.omit(fullData)

lm_model<- lm(FTR ~ BWA + BWH + BWD ,  fullData)
mylogit <- glm(FTR ~ .,data = fullData)

model <- svm(FTR ~ BWH+BWD+BWA, data=engData,type="C-classification")
#model <- ctree(FTR ~ HC+AC+HF+AF+HY+AY+HR+AR+HS+AS+HST+AST, data=engData)
print(model)
summary(model)
pred <- predict(model)
table(pred,engData[,"FTR"])

# HC,AC,HF,AF,HO,AO,HY,AY,HR,AR,HS,AS,HST,AST,HHW,AHW,
# HC+AC+HF+AF+HY+AY+HR+AR+HS+AS+HST+AST
# BWH+ BWD+BWA
set.seed(415)
fit <- randomForest(FTR ~ HC+AC+HF+AF+HY+AY+HR+AR+HS+AS+HST+AST, data=engData, 
                    importance=TRUE,#
                    ntree=500,proximity=TRUE)
fit
rpart::na.rpart()

score
